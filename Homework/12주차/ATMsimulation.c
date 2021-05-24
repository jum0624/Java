#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define MAX 3

typedef struct Customer {
    int id;  //����ȣ
    int vip;  // vip�� ����
    int prime;  //�Ҽ���° �Ǻ�
    int service_time;  //���� �ð�
}Customer; //������

typedef struct Node {  //�� atm���� �� ������
    Customer data; //������ ������
    struct Node* prev;
    struct Node* next;
}Node;

typedef struct atm {
    int count;   //���� ��
    int number;   //atm��� ��ȣ
    int total_person;  // ������ �� �� ���� ��
    int wait_time_average;  // ��ٸ� �ð��� ���
    int wait_person;  // ��ٸ��� �ִ� ���� ��
    int useAtm;  //atm��⸦ ����ϴ� ���� ���� �����ð�
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

int size(atm* p) {  //�� atm���� ���� ��
    return p->count;
}

int isempty(atm* p) {
    if (size(p) == 0) {
        return 1;
    }
    else return 0;
}

void front_push(atm* p, Customer c) {  //�տ� �� ������ �߰�
    Node* new = (Node*)malloc(sizeof(Node));
    new->data = c;
    new->next = NULL;

    if (isempty(p)) {  //atm��⿡ ���� ���� ��
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

void back_push(atm* p, Customer c) {  // ���� �ڿ� �� ������ �߰�
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

Customer removeFront(atm* p) {  //�տ� �ִ� �� ������ ����
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

void Remove(atm* p, Node* del) {  //�� ������ ����
    if (p->count == 1) {   //�Ѹ��� ���� �����͸� ������ ���
        p->front = NULL;
        p->rear = NULL;
    }
    else if (p->front == del) {   //���� �տ� ���� �����͸� ���� ���
        p->front = p->front->next;
        p->front->prev = NULL;
    }
    else if (p->rear == del) {    //���� �ڿ� ���� �����͸� ���� ���
        p->rear = p->rear->prev;
        p->rear->next = NULL;
    }
    else {    //�߰��� �ִ� ���� �����͸� ������
        del->next->prev = del->prev;
        del->prev->next = del->next;
    }
    p->count -= 1;
    free(del);
}

int IsPrime(int n) {   //�Ҽ��Ǻ�
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

int IsVip() {   //vip���� Ȯ��
    return rand() % 10 == 1;
}

int Min(int x, int y, int z) {               // �� ������ �ּڰ�
    if (x <= y && x <= z)
        return x;
    else if (y <= x && y <= z)
        return y;
    else
        return z;
}

int line(atm* p) {  // ���� ���� �ο��� ���ִ� �ٺ��� �ټ����
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

        if (customer.vip) {   //���� vip�̸� ���� ���ٿ� ���
            front_push(&p[order], customer);
        }
        else {    //�Ϲݰ��̸� ���� �ں��� ���
            back_push(&p[order], customer);
        }

        for (int i = 0; i < MAX; i++) {
            if (!isempty(&p[i]) && p[i].useAtm == 0) {  //atm��⿡ ���� �ְ� �ش� atm��Ⱑ ������� ���
                Customer pop = removeFront(&p[i]);    //���� �տ��ִ� ���� ���� �� �ٿ��� ����
                printf("%d�� %d�� - %d�� ��(%d�� �ҿ�)�� %d�� ATM���� ���񽺸� ������.\n", h, m, pop.id, pop.service_time, i + 1);
                p[i].useAtm = pop.service_time;   //�ش� ������ ���� �����ð�
                p[i].total_person++;    //�ϳ��� atm ��⿡�� ��ü ������ �� ���� �� +1
            }
            if (p[i].useAtm > 0) {  //atm��⿡�� ������ �����ð��� ���� ���(atm��� �����)
                p[i].useAtm--;
                p[i].wait_time_average += size(&p[i]);  //atm��⿡�� ����ϰ� �ִ� ���� ���ð� +1*(���� ���� �ο���)
            }
        }
        if (clock != 0 && (clock % 10 == 0)) {    //10�и��� �Ҽ���° ������ ��������
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
    printf("������ �� �� ���� �� = %d\n", totalperson);
    printf("��� ��ٸ� �ð� = %f\n", waittime / 120.0f);
    printf("���� ��ٸ��� �ִ� ���� �� = %d\n", totalsize);

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