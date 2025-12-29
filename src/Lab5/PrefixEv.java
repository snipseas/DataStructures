package Lab5;
//5-3
public class PrefixEv {
    public static boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }

    public static int calculate(String operator, String operand1, String operand2){
        int op1 = Integer.parseInt(operand1);
        int op2 = Integer.parseInt(operand2);
        if(operator.equals("+"))
            return op1+op2;
        if(operator.equals("-"))
            return  op1-op2;
        if(operator.equals("*"))
            return  op1*op2;
        else
            return  op1/op2;
        }

        public static int evaluate(String exp){
        String[] array = exp.split(" ");
        QueueObj items = new QueueObj(array.length);

        while(items.size()>1){
            String first = (String) items.dequeue();
            if(!isOperator(first)){
                String second=(String) items.dequeue();
                if(!isOperator(second)){
                    items.dequeue();
                    String third = (String) items.peek();
                    if(!isOperator(third)){
                        items.dequeue();
                        int result = calculate(first,second,third);
                        items.enqueue("" + result);
                    }
                    else {
                        items.enqueue(first);
                        items.enqueue(second);
                    }
                }
                else
                    items.enqueue(first);
            }
            else
                items.enqueue(first);
        }
            return Integer.parseInt((String) items.dequeue());

        }

        public static void main(String[] args){
        String input = " 1 * 2 3";
        System.out.println(input + "=" + evaluate(input));
        }

    }

//this doesnt work nor do i understand it lol