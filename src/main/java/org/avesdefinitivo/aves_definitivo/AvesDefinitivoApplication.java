package org.avesdefinitivo.aves_definitivo;

/*import org.avesdefinitivo.aves_definitivo.entities.Ave;
import org.avesdefinitivo.aves_definitivo.entities.Clasificacion;
import org.avesdefinitivo.aves_definitivo.entities.Edb;
import org.avesdefinitivo.aves_definitivo.entities.Interesado;
import org.avesdefinitivo.aves_definitivo.repositories.AveRepository;
import org.avesdefinitivo.aves_definitivo.repositories.ClasificacionRepository;
import org.avesdefinitivo.aves_definitivo.repositories.EdbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;*/
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class AvesDefinitivoApplication {

    public static void main(String[] args) {

        SpringApplication.run(AvesDefinitivoApplication.class, args);
    }

    /*@Autowired
    private EdbRepository edbRepository;

    @Autowired
    private ClasificacionRepository clasificacionRepository;

    @Autowired
    private AveRepository aveRepository;

    
    @Override
    public void run(String... args) throws Exception {
        //manyToOne();
        //manyToOne2();
        busquedaPorClasificacion();
    }


    public void manyToOne(){

        Edb edb = new Edb("ADULTO");
        edbRepository.save(edb);
        Clasificacion clasificacion = new Clasificacion("Serinus canaria domestica".toUpperCase(),
                                                        "Canario".toUpperCase());
        clasificacionRepository.save(clasificacion);
        Ave ave = new Ave(edb,clasificacion,"cuellito morado" , "C:/foto.jpg" , true , 45 , "blanquita");

        aveRepository.save(ave);

    }

    @Transactional
    public void manyToOne2(){
        Edb edb = edbRepository.findByNombre("HUEVO");
        System.out.println(edb);
        Clasificacion clasificacion = clasificacionRepository
                .findByNombreCientificoAndNombreComun("Psittacoidea" , "Loro");
        System.out.println(clasificacion);

    }

    @Transactional
    public void busquedaPorClasificacion(){
        List<Ave> aves = aveRepository.findByClasificacionNombreComun("Loro");
        aves.forEach(System.out::println);
    }

    @Transactional
    public void herencia (){
        Interesado i = new Interesado("cbo@gmail.com" ,
                                        "22222",
                                        LocalDate.now(),
                                        "233423", "CC",
                                        "LOLO" , "LANDA",
                "ACEPTADO"

                );
    }
*/

}
