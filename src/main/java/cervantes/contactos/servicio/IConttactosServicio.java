package cervantes.contactos.servicio;

import cervantes.contactos.modelo.Contacto;

import java.util.List;

public interface IConttactosServicio {

    public List<Contacto> listarContactos();

    public Contacto buscarContactoPorId(Integer idContacto);

    public void guardarContacto(Contacto contacto);

    public void eliminarContacto(Contacto contacto);


}
