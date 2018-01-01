package lambda;

public class InterfaceConflictMethodNameTest extends InterfaceSuperClass implements Person, Identified {

    public static void main(String[] args) {

        InterfaceConflictMethodNameTest iCMT = new InterfaceConflictMethodNameTest();
        System.out.println(iCMT.getId());

    }

//    @Override
//    public int getId() {
//       return 0;
//    }
}
