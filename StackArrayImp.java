public class StackArrayImp {

    int  max  ;
    int top ;
    int stackValues[] ;

    StackArrayImp (int max){
        this.max = max;
        this.stackValues = new int[max];
        top = -1 ;
    }

    // push the stack
    public void push (int value) {
        if(isFull()){
            System.out.println("Stack is full") ;
        }
        else{
            stackValues[++top] = value ;
            System.out.println("Push " + value + " into the stack");
        }
    }    

        //pop the stack
        public int pop (){
            if(isEmpty()){
                System.out.println("Stack is empty") ;
                return -1 ;
            }
            else{
                return stackValues[top--] ;
            }
        }

        //peek the value
        public int peek (){
            if(isEmpty()){
                System.out.println("Stack is empty") ;
                return -1;
            }    
            else{
                return stackValues[top] ;
            }
        } 
        
        boolean isFull(){
            return (top == max-1) ;
        }

        boolean isEmpty(){
            return (top == -1) ;
        }

        void print(){
            for(int i = top ; i > -1 ; i--){
                System.out.print(""+stackValues[i]) ;
            }    
        }
    public static void main(String[] args) {

        StackArrayImp s = new StackArrayImp(5);

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        
        System.out.println("Top element in stack is : "  + s.peek() );
        System.out.println("pop element : " + s.pop());
        System.out.println("Top element in stack is : "  + s.peek());
        System.out.print("Total Element in stack :  " );
        s.print();
       
    }
}
