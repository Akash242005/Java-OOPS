class gen<T>{
    T rollno;
    public T getRollno() {
        return rollno;
    }
    public void setRollno(T rollno) {
        this.rollno = rollno;
    }
}

public class Main {
    public static void main(String[] args) {
        gen<String> first = new gen<>();
        first.setRollno("938");
        gen<Integer> first2 = new gen<>();
        first2.setRollno(498);
        System.out.println(first.getRollno() +" "+ first2.getRollno());
    }
}
