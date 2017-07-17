package core;

/**
 * Created by Sh-Java on 12/23/2016.
 */
public class Student {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        String str="id="+id+'\t'+"name="+name;
        return str;

    }
}
