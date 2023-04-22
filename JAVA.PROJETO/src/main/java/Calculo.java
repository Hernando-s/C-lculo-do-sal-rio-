
public class Calculo {

    float SalBruto, QtdHrTb, ValHora, DescInss, DescIr, SalLiqd;

    public void getdados(float ValHora, float QtdHrTb) {
        this.ValHora = ValHora;
        this.QtdHrTb = QtdHrTb;

    }

    public float SalBruto() {
        SalBruto = (this.ValHora * this.QtdHrTb);
        return SalBruto;
    }

    public float DescInss() {

        if (this.SalBruto() <= 1000) {
            DescInss = this.SalBruto() * 0.08f;
        } else if (this.SalBruto() > 1000) {
            DescInss = this.SalBruto() * 0.09f;
        }
        return DescInss;
    }


    public float DescIr() {

        if (this.SalBruto() <= 500) {
            DescIr = this.SalBruto() * 0;
        } else if (this.SalBruto() > 500 && this.SalBruto() <= 1000) {
            DescIr = this.SalBruto() * 0.06f;
        }
        if (this.SalBruto() > 1000) {
            DescIr = this.SalBruto() * 0.07f;
        }
        return DescIr;
    }

    public float SalLiqd() {
        SalLiqd = this.SalBruto() - this.DescInss() - this.DescIr();
        return SalLiqd;
    }
     
}/*
  jTextField1.setText("");
        jTextField2.setText("");
        jTextField1.requestFocus();
   float ValHora = Float.parseFloat(jTextField1.getText());
        float QtdHrTb = Float.parseFloat(jTextField2.getText());

        Calculo salario = new Calculo();
        salario.getdados(ValHora, QtdHrTb);
        float DescInss = salario.DescInss();
        float DescIr = salario.DescIr();
        float SalBruto = salario.SalBruto();
        float SalLiqd = salario.SalLiqd();

        jLabel11.setText(String.valueOf(SalLiqd));
        jLabel9.setText(String.valueOf(DescInss));
        jLabel8.setText(String.valueOf(DescIr));
        jLabel10.setText(String.valueOf(SalBruto));
*/