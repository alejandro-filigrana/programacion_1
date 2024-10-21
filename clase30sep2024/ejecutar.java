public class ejecutar {
    public static void main(String[]arge){
        //creacion del objeto
        persona objp1 = new persona("pipe", 1.80, 80.0, 22);
        
        objp1.caminar();
        String respuesta = objp1.IMC();


        System.out.println(respuesta);
        System.out.println(objp1.mayorEdad(20));
        }
}
