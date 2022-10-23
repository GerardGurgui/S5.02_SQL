package cat.itacademy.barcelonactiva.GurguiBallv.Gerard.s05.t02.n01.entities;


import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "registro_tiradas")
public class Tirada implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int dado1;
    private int dado2;
    private int resultadoTirada;

//    @ManyToOne
//    private Jugador jugador;


//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JoinColumn(name = "tirada_id", referencedColumnName = "id")
//    private Set<Dado> dados;




    public Tirada() {
    }

    public int getDado1() {
        return dado1;
    }

    public void setDado1(int dado1) {
        this.dado1 = dado1;
    }

    public int getDado2() {
        return dado2;
    }

    public void setDado2(int dado2) {
        this.dado2 = dado2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getResultadoTirada() {
        return resultadoTirada;
    }

    public void setResultadoTirada(int resultadoTirada) {
        this.resultadoTirada = resultadoTirada;
    }


//    public Jugador getJugador() {
//        return jugador;
//    }
//
//    public void setJugador(Jugador jugador) {
//        this.jugador = jugador;
//    }

    //    public Set<Dado> getDados() {
//        return dados;
//    }
//
//    public void setDados(Set<Dado> dados) {
//        this.dados = dados;
//    }
//
//
//    public void addDado(Dado dado){
//
//        if (dados == null){
//            dados = new HashSet<>();
//        }
//
//        dados.add(dado);
//
////        dado.setTirada(this);
//
//    }


    @Override
    public String toString() {
        return "Tirada{" +
                "id=" + id +
                ", tirada=" + resultadoTirada +
                '}';
    }


}