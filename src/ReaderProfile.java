
public class ReaderProfile {
	String name;
    String secondname;
    String grade;
    String phone;
    int takenBooks;

    public String getGrade() 
    {
        return grade;
    }
    public String getName() 
    {
        return name;
    }
    public String getPhone() 
    {
        return phone;
    }
    public String getSecondName() 
    {
        return secondname;
    }
    public int getTakenBooks() 
    {
        return takenBooks;
    }
    public void setGrade(String grade) 
    {
        if(grade != null && !grade.isEmpty() && grade.length() == 1) {
            this.grade = grade;
        }
    }
    public void setName(String name) 
    {
        if(name != null && !name.isEmpty()) {
            this.name = name;
        }
    }
    public void setPhone(String phone) 
    {
        if(phone != null && phone.length() == 10) {
            this.phone = phone;
    	}
    }
    public void setSecondName(String secondname) 
    {
        if(secondname != null && !secondname.isEmpty()) {
            this.secondname = secondname;
        }
    }
    public void setTakenBooks(int takenBooks) 
    {
        if(takenBooks > -1) {
            this.takenBooks = takenBooks;
        }
    }
    public ReaderProfile(String name, String secondname, String grade, String phone, int takenBooks)
    {
        setName(name);
        setSecondName(secondname);
        setGrade(grade);
        setPhone(phone);
        setTakenBooks(takenBooks);
    }
    public ReaderProfile(String name, String secondname, String grade, String phone)
    {
        setName(name);
        setSecondName(secondname);
        setGrade(grade);
        setPhone(phone);
    }
    public String toString() 
    {
        return String.format("%s, %s, %s, %s, %d", getName(), getSecondName(), getGrade(), getPhone(), getTakenBooks());
    }
}
