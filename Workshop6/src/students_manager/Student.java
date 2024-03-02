package students_manager;

public class Student {
    private String code;
    private String name;
    private int mark;
    
    public Student(){
    }
    
    public Student(String newCode, String newName, int newMark){
        setCode(newCode);
        setName(newName);
        setMark(newMark);
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }

    public void setCode(String code){
        this.code = code.toUpperCase();
    }

    public void setName(String name) {
        if(!name.trim().toUpperCase().isEmpty())
            this.name = name.trim().toUpperCase();
        else{
            System.out.println("Invalid this name!");
             return;
        }
    }

    public void setMark(int mark) {
        if (mark>=0 && mark<=10)
            this.mark = mark;
        else{
            System.out.println("Invalid this mark");
            return;
        }
    }
    
    @Override
    public String toString(){
        return this.code+","+this.name+","+this.mark;
    }
}
