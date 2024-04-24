package Estructuras1;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class main{
    public static void main(String[] args){
        LinkedList lista = new LinkedList();
        LinkedList<empleado> empleados = new LinkedList<empleado>();
        lista.add("pedro");
        lista.add(234);
        System.out.println(lista);

        for (int index = 0; index < 2; index++) {
            empleado emp = new empleado(null, null, null, index, null);
            emp.setNombre(JOptionPane.showInputDialog("Ingrese el nombre"));
            emp.setApellido(JOptionPane.showInputDialog("Ingrese el apellido"));
            emp.setDireccion(JOptionPane.showInputDialog("Ingrese la direccion"));
            emp.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad")));
            emp.setCargo(JOptionPane.showInputDialog("Ingrese el cargo"));
            empleados.add(emp);
        }
        for (empleado e : empleados) {
            JOptionPane.showMessageDialog(null, e.getNombre() + "\n" + e.getApellido() + "\n" + e.getDireccion() + "\n" + e.getEdad() + "\n" + e.getCargo());
        }
    }
}