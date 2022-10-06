package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.util.ArrayList;

public class EspecialidadeDao {
    
    /*
    Essa classe será responsavel pela persistencia de dados das
    especialidades, por  exemplo, adicionar uma nova especialidade,
    excluir uma especialidade, etc.
    */
    
    private static ArrayList<Especialidade> especialidades = new ArrayList<>();
    
    public static void gravar(Especialidade e) {//CREATE
        especialidades.add(e);
    }
    
    public static ArrayList<Especialidade> getEspecialidades() {//READ
        return especialidades;
    }
    
    public static Especialidade getEspecialidade(Integer codigo) {//READ
        for(Especialidade e : especialidades){
            if (e.getCodigo() == codigo){
                return e;
            }
        }
        
        return null;
        
    }
    
    
    public static void excluir(Integer codigo) {//DELETE
        for(Especialidade e : especialidades){
            if (e.getCodigo() == codigo){
                especialidades.remove(e);
                break;
            }
        }
        
    }
    
    public static void atualizar(Especialidade especialidadeAtualizada) {//UPDATE
         for(Especialidade e : especialidades){
            if (e.getCodigo() == especialidadeAtualizada.getCodigo()){
               especialidades.set(especialidades.indexOf(e), especialidadeAtualizada);
                break;
            }
        }
    }
    
    //Criar uma lista inicial de especialidades
    public static void criarListaDeEspecialidades() {
        Especialidade e1 = new Especialidade("Cardiologia", "Area da medicina que cuida do coração");
        Especialidade e2 = new Especialidade("Nefrologia", "Cuida do rim");
        Especialidade e3 = new Especialidade("Otorrinolaringologia", "Cuida do ouvido");
        Especialidade e4 = new Especialidade("Pediatria", "Cuida da saude das crianças");
        
        especialidades.add(e1);
        especialidades.add(e2);
        especialidades.add(e3);
        especialidades.add(e4);
    }
    
}
