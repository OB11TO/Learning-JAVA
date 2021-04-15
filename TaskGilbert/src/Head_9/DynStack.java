package Head_9;

public class DynStack implements IntStack{
    private int stack[];
    private int tos;

    DynStack(int size){
        stack = new int[size];
        tos = -1;
    }
    @Override
    public int pop() {
        if(tos < 0){
            System.out.println("Стек не загружен");
            return 0;
        }else{
           return stack[tos--];
        }

    }

    @Override
    public void push(int item) { //???????????????????
        if(tos == stack.length - 1){
            int[] tmp = new int[stack.length * 2];
            for(int i = 0; i < stack.length; i++) tmp[i] = stack[i];

            stack = tmp;
            stack[++tos] = item;

        }
        else{
            stack[++tos] = item;
        }
    }
}
class MainD{
    public static void main(String[] args) {
        DynStack dStackOne = new DynStack(4);
        DynStack dStackTwo = new DynStack(2);

        for(int i=0; i<12; i++) dStackOne.push(i);

        System.out.println("Cтeк в dStackOne:");
        for(int i=0; i<12; i++)
            System.out.println(dStackOne.pop());
    }
}
