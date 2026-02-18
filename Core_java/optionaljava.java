import java.util.Optional;
class forExample{
    // optional class as the return value for it
    // when we dont know the if function return any value or not in that time we can use this
     public Optional<String> getname()
    {
     return Optional.ofNullable(null);

    }
}

public class optionaljava {
    public static void main(String []a)
    {
    String name=null;
    Optional<String> nm=Optional.of("hlobaba");
    //chechs is there is value or  not
   System.out.println(nm.isPresent());
   System.out.println(nm);
   //get returns the value
   System.out.println(nm.get().toUpperCase());
   //the orElse return the value if its present or it returns the value you provided in the block
   System.out.println(nm.orElse("hello dosto"));
   //ifpresent if there is data then is execute the contents in the action block
   nm.ifPresent(nmn->System.out.println("hello")) ;
   forExample obj=new forExample();
   //we can also use Optional as a return values
   Optional<String> str=obj.getname();
   System.out.println(str.orElse("null value returned"));
   
   

    }
}
