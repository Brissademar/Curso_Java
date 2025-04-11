public class Paciente {
    //Atributos
    String Nombre;
    int edad;
    String padecimiento;
    String n_Expediente;
    public void MostrarInformación(){
        System.out.println("Nombre del paciente: "+ Nombre +'\n'+"Padecimiento: "+padecimiento+'\n'+"Edad: "+edad+'\n'+"Número de expediente: "+n_Expediente);
    }
}
