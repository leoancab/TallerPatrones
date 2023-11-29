public class SistemaInformes {
    private static SistemaInformes instancia;

    private SistemaInformes() {}

    public static SistemaInformes getInstance() {
        if (instancia == null) {
            instancia = new SistemaInformes();
        }
        return instancia;
    }

    public void generarYVisualizarInforme(InformeCreator creator) {
        Informe informe = creator.createInforme();
        informe.visualizarReporte();
       
    }
    
}
