package Head_9;

// Реализация стека для фиксированного размера
public class FixedStack implements IntStack{
    private  int[] stack;
    private int tos;

    //выделить память и инициализировать стек
    FixedStack(int size){
        stack = new int[size];
        tos = -1;

    }
    @Override
    public int pop() {
        if(tos < 0){
            System.out.println("Стек не загружен");
            return 0;
        }
        else{
            return stack[tos--];
        }

    }

    @Override
    public void push(int item) {
        if(tos == stack.length - 1){
            System.out.println("Стек заполнен");
        }else{
            stack[++tos] =item;
        }
    }
}

class Main{
    public static void main(String[] args) {
        FixedStack fixOne = new FixedStack(8);
        FixedStack fixTwo = new FixedStack(6);
        //разместить
        for(int i=0; i<8; i++) fixOne.push(i);
        for(int i=0; i<6; i++) fixTwo.push(i);
        //извлечь
        System.out.println("Cтeк в fixOne:");
        for(int i=0; i<8; i++)
            System.out.println(fixOne.pop());
    }
}
