import lombok.Data;
import lombok.SneakyThrows;

@Data
public class Teacher  {

    private String name;
    private String surname;
@SneakyThrows
    public void foo(int a)  {
        if(a<9){
            throw new Exception("sehv");
        }
    }


}
