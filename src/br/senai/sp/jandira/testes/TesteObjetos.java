package br.senai.sp.jandira.testes;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.AgendaApp;
import br.senai.sp.jandira.dao.EspecialidadeDao;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteObjetos {

    public static void main(String[] args) {
        
        int[][] c = {
            {4,5,9},
            {1,13,25}   
        };

        Especialidade e1 = new Especialidade("Cardiologia");
        e1.setNome("Cardiologia");
        e1.setDescricao("Não deixa ter um ataque");
        
        EspecialidadeDao.gravar(e1);
        
        Especialidade e2 = new Especialidade("Gastroenterologia");
        e2.setNome("Gastroenterologia");
        e2.setDescricao("Não deixa com dor de barriga");
        
        EspecialidadeDao.gravar(e2);
        
        for (Especialidade ee : EspecialidadeDao.getEspecialidades()) {
            System.out.println(ee.getNome());
        }

        Especialidade e3 = new Especialidade();
        e3.setNome("Qualquer coisa");
        
        Especialidade e4 = new Especialidade("Otorrino", "Cuida do ouvido");

        //Exibir a quantidade de especialidades
        System.out.println(e1.getContador());

        ArrayList<Especialidade> especialidades = new ArrayList<>();
        especialidades.add(e1);
        especialidades.add(e2);
        especialidades.add(e3);
        System.out.println("Total Especialidades");
        System.out.println(especialidades.size());
        System.out.println(e1.getCodigo() + " - " + e1.getNome());
        System.out.println(e2.getCodigo() + " - " + e2.getNome());
        System.out.println(e3.getCodigo() + " - " + e3.getNome());
        System.out.println(e4.getCodigo() + " - " + e4.getNome());

        //imprimir no console o nome das especialidades que estão armazenadas no ArrayList
        int i = 0;
        while (i < especialidades.size()) {
            System.out.println(especialidades.get(i).getNome());
            i++;
        }

        //Utilização do for para iteração
        System.out.println("-----------------FOR--------------------");
        for (int x = 0; x < especialidades.size(); x++) {
            System.out.println(especialidades.get(x).getNome());
        }

        //FOR each -> Para cada
        System.out.println("--------------------FOR EACH-----------------------");
        for (Especialidade e : especialidades) {
            System.out.println(e.getNome());
        }

        // Criar três planos de Saúde, armazenar em um ArrayList e exibir cada um deles
        PlanoDeSaude plano1 = new PlanoDeSaude("Unimed");
        PlanoDeSaude plano2 = new PlanoDeSaude("Bradesco");
        PlanoDeSaude plano3 = new PlanoDeSaude("Notredame");

        ArrayList<PlanoDeSaude> planosDeSaude = new ArrayList<>();
        planosDeSaude.add(plano1);
        planosDeSaude.add(plano2);
        planosDeSaude.add(plano3);

        System.out.println("--------------Operadoras----------------");
        for (PlanoDeSaude e : planosDeSaude) {
            System.out.println(e.getOperadora());
            
        }

        //System.out.println(PlanoDeSaude.getQuantidade());
        AgendaApp.main(args);

       

    }

}
