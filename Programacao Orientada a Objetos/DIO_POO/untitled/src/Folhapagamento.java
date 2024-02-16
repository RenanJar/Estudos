public class Folhapagamento {

    double calcularsalario(int horasnormais,int horasextras,double valorhoranormal, double valorhoraextras){
        double valorhorasnormais= horasnormais*valorhoranormal;
        double valorhorasextras=valorhoraextras*horasextras;
        return valorhorasnormais+valorhorasextras;

    }
}
