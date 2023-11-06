package cervantes.contactos.servicio;


import cervantes.contactos.modelo.Contacto;
import cervantes.contactos.repositorio.ContactoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactoServicio implements IConttactosServicio{

    @Autowired
    private ContactoRepositorio contactoRepositorio;


    @Override
    public List<Contacto> listarContactos() {
        return contactoRepositorio.findAll();

    }

    @Override
    public Contacto buscarContactoPorId(Integer idContacto) {
        Contacto contacto = contactoRepositorio.findById(idContacto).orElse(null);


        return contacto;
    }

    @Override
    public void guardarContacto(Contacto contacto) {
        contactoRepositorio.save(contacto);

    }

    @Override
    public void eliminarContacto(Contacto contacto) {

        contactoRepositorio.delete(contacto);

    }
}
