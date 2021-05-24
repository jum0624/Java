#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define MAX 3

typedef struct Customer {
    int id;  //고객번호
    int vip;  // vip고객 여부
    int prime;  //소수번째 판별
    int service_time;  //서비스 시간
}Customer; //고객정보

typedef struct Node {  //한 atm기기당 고객 데이터
    Customer data; //고객정보 데이터
    struct Node* prev;
    struct Node* next;
}Node;

typedef struct atm {
    int count;   //고객의 수
    int number;   //atm기기 번호
    int total_person;  // 업무를 본 총 고객의 수
    int wait_time_average;  // 기다린 시간의 평균
    int wait_person;  // 기다리고 있는 고객의 수
    int useAtm;  //atm기기를 사용하는 고객의 남은 업무시간
    Node* front;
    Node* rear;
}atm;

void init(atm* p) {
    p->front = p->rear = NULL;
    p->count = 0;
    p->useAtm = 0;
    p->total_person=0; 
    p->wait_time_average=0; 
    p->wait_person=0;    
}

int size(atm* p) {  //한 atm기기당 고객의 수
    return p->count;
}

int isempty(atm* p) {
    if (size(p) == 0) {
        return 1;
    }
    else return 0;
}

void front_push(atm* p, Customer c) {  //앞에 고객 데이터 추가
    Node* new = (Node*)malloc(sizeof(Node));
    new->data = c;
    new->next = NULL;

    if (isempty(p)) {  //atm기기에 고객이 없을 때
        p->front = new;
        p->rear = new;
        new->prev = NULL;
        new->next = NULL;
    }
    else {
        p->front->prev = new;
        new->prev = NULL;
        new->next = p->front;
        p->front = new;
    }
    p->count += 1;
}

void back_push(atm* p, Customer c) {  // 가장 뒤에 고객 데이터 추가
    Node* new = (Node*)malloc(sizeof(Node));
    new->data = c;

    if (isempty(p)) {
        p->front = new;
        p->rear = new;
        new->prev = NULL;
        new->next = NULL;
    }
    else {
        p->rear->next = new;
        new->next = NULL;
        new->prev = p->rear;
        p->rear = new;
    }
    p->count += 1;
}

Customer removeFront(atm* p) {  //앞에 있는 고객 데이터 제거
    Node* old = p->front;
    Customer return_ct = old->data;
    if (p->front->next == NULL) {
        p->front = NULL;
        p->rear = NULL;
    }
    else {
        p->front = p->front->next;
        p->front->prev = NULL;
    }
    p->count -= 1;
    free(old);
    return return_ct;
}

void Remove(atm* p, Node* del) {  //고객 데이터 제거
    if (p->count == 1) {   //한명의 고객님 데이터만 존재할 경우
        p->front = NULL;
        p->rear = NULL;
    }
    else if (p->front == del) {   //가장 앞에 고객의 데이터를 지울 경우
        p->front = p->front->next;
        p->front->prev = NULL;
    }
    else if (p->rear == del) {    //가장 뒤에 고객의 데이터를 지울 경우
        p->rear = p->rear->prev;
        p->rear->next = NULL;
    }
    else {    //중간에 있는 고객의 데이터를 지울경우
        del->next->prev = del->prev;
        del->prev->next = del->next;
    }
    p->count -= 1;
    free(del);
}

int IsPrime(int n) {   //소수판별
    int i = 0;
    int last = n / 2;
    if (n <= 1)
    {
        return 0;
    }
    for (i = 2; i <= last; i++)
    {
        if ((n % i) == 0)
        {
            return 0;
        }
    }
    return 1;
}

int IsVip() {   //vip여부 확인
    return rand() % 10 == 1;
}

int Min(int x, int y, int z) {               // 세 정수의 최솟값
    if (x <= y && x <= z)
        return x;
    else if (y <= x && y <= z)
        return y;
    else
        return z;
}

int line(atm* p) {  // 가장 적은 인원이 서있는 줄부터 줄세우기
    int sizeList[3] = { size(&p[0]),size(&p[1]),size(&p[2]) };
    for (int i = 0; i < MAX; i++) {
        if (p[i].useAtm > 0) {
            sizeList[i] ++;
        }
    }
    int result = Min(sizeList[0], sizeList[1], sizeList[2]);
    int list[3] = { 0, };
    for (int i = 0; i < 3; i++) {
        if (sizeList[i] == result) {
            list[i] = 1;
        }
    }
    int tmp = rand() % 3;
    int k = list[tmp];
    while (k != 1) { 
        tmp = rand() % 3;
        k = list[tmp];
    }
    return tmp;
}

int main() {
    atm* p;
    p = (atm*)malloc(MAX * sizeof(atm));

    for (int i = 0; i < MAX; i++) {
        init(&p[i]);
    }

    int minutes = 120;
    srand(time(NULL));

    for (int clock = 0; clock < minutes; clock++) {
        int h = 9 + (clock / 60);
        int m = clock % 60;

        Customer customer;
        int order = line(p);
        customer.id = m;
        customer.service_time = rand() % 9 + 2;
        customer.vip = IsVip();
        customer.prime = IsPrime(m);

        if (customer.vip) {   //고객이 vip이면 제일 앞줄에 대기
            front_push(&p[order], customer);
        }
        else {    //일반고객이면 가장 뒤부터 대기
            back_push(&p[order], customer);
        }

        for (int i = 0; i < MAX; i++) {
            if (!isempty(&p[i]) && p[i].useAtm == 0) {  //atm기기에 줄이 있고 해당 atm기기가 비어있을 경우
                Customer pop = removeFront(&p[i]);    //가장 앞에있는 고객님 입장 및 줄에서 삭제
                printf("%d시 %d분 - %d번 고객(%d분 소요)이 %d번 ATM에서 서비스를 시작함.\n", h, m, pop.id, pop.service_time, i + 1);
                p[i].useAtm = pop.service_time;   //해당 고객님의 남은 업무시간
                p[i].total_person++;    //하나의 atm 기기에서 전체 업무를 본 고객의 수 +1
            }
            if (p[i].useAtm > 0) {  //atm기기에서 고객님의 업무시간이 남은 경우(atm기기 사용중)
                p[i].useAtm--;
                p[i].wait_time_average += size(&p[i]);  //atm기기에서 대기하고 있는 고객의 대기시간 +1*(남은 고객의 인원수)
            }
        }
        if (clock != 0 && (clock % 10 == 0)) {    //10분마다 소수번째 고객님이 빠져나감
            for (int i = 0; i < MAX; i++) {
                Node* nowNode = p[i].front;
                while (nowNode) {
                    Node* nextNode = nowNode->next;
                    if (nowNode->data.prime)
                        Remove(&p[i], nowNode);
                    nowNode = nextNode;
                }
            }
        }
    }
    int totalperson = 0;
    int waittime = 0;
    int totalsize = 0;
    for (int i = 0; i < MAX; i++) {
        totalperson += p[i].total_person;
        waittime += p[i].wait_time_average;
        totalsize += size(&p[i]);
    }
    printf("업무를 본 총 고객의 수 = %d\n", totalperson);
    printf("평균 기다린 시간 = %f\n", waittime / 120.0f);
    printf("현재 기다리고 있는 고객의 수 = %d\n", totalsize);

    for (int i = 0; i < MAX; i++) {
        Node* nowNode = p[i].front;
        while (nowNode) {
            Node* nextNode = nowNode->next;
            free(nowNode);
            nowNode = nextNode;
        }
    }
    free(p);
}