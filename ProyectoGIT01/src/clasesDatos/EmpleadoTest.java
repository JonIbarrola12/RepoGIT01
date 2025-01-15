package clasesDatos;

public class EmpleadoTest {

	public static void main(String[] args) {
		Empleado emp1=null;
		Empleado emp2=null;
		
		emp1=new Empleado("12333435G","PEPE","GARCIA", null, false, 0);
		emp2=new Empleado("12333435G","PEPE","GARCIA", null, false, 0);
		
		emp1.setDni("15643576G");
		
		System.out.println(emp1.getDni());
		
		System.out.println(emp1);
		System.out.println(emp2);
		
		if(emp1.equals(emp2)) System.out.println("Son iguales");
		else System.out.println("Son distintas");
		
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		
		emp2.setDni("14233456J");
		emp2.setApellidos("Garcia");
		emp2.setNombre("Pepe");
		
		System.out.println(emp1);
		System.out.println(emp2);
		
		if(emp1.equals(emp2)) System.out.println("Son iguales");
		else System.out.println("Son Distintas");
		
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		
		emp1.setClubSocial();
		
	}

}
