class Student
{

int age;
String name;
int grade;

Student(int age, String name, int grade){
this.age=age;
this.name=name;
this.grade=grade;
}
void show(){
System.out.println("Hello I am "+this.name+" I am  this many years old "+this.age+" I am in grage : "+this.grade);
}
}
class program{
    public static void main(String[] args) {
        Student em=new Student(10,"pradyun",  5);
        em.show();
    }
}