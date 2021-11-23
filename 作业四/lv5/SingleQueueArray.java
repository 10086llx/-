import java.util.*;

    public class SingleQueueArray<AnyType>
    {
        SingleQueueArray()
        { this(101); } // note: actually holds one less than given size
        //实际上使用的是给定的大小减一
        SingleQueueArray(int s)
        {
            maxSize = s;
            front = 0;
            rear = 0;
            elements = new ArrayList<AnyType>(maxSize);
        }
        void enqueue(AnyType x)//入队
        {
            if ( !full() )
            {
                if (elements.size() < maxSize)
                    elements.add(x);  //如果队尾从来没有到达过最后位置
                else
                    elements.set(rear, x); // after size is reached, use set
//如果已经到达了最后位置，即链表已经被装满了，以后的情况也会是装满的情况了
                rear = (rear + 1) % maxSize;
            }
        }
        AnyType dequeue()//出队
        {
            AnyType temp=null;
            if ( !empty() )
            {
                temp = elements.get(front);
                front = (front+1) % maxSize;
            }
            return temp;
        }

        boolean empty()
        { return front == rear; }

        boolean full()
        { return (rear + 1) % maxSize == front; }

        private int front, rear;
        private int maxSize;
        private ArrayList<AnyType> elements;

        public static void main(String[] args) {
            ArrayList SingleQueuearry = new ArrayList();
            System.out.println("打印ArrayList中的所有元素:");
            for(int i=1;i<=100;i++){
                SingleQueuearry.add(i);
            }
            Iterator it = SingleQueuearry.iterator();
            while(it.hasNext()){
                System.out.println(it.next()); }

            try {
                System.out.println("调用get()读取索引位置为50：");
                System.out.println(SingleQueuearry.get(50-1));
                System.out.println("调用get()读取索引位置为102：");
                System.out.println(SingleQueuearry.get(102-1));
            }
            catch (IndexOutOfBoundsException e) {
                System.out.println("数据越界啦");
            }

        }

    }


