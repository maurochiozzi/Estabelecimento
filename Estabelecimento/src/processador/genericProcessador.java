package processador;

import DAO.genericDAO;

public abstract class genericProcessador<T> {
	private final Class<T> typeParameterClass;
	protected genericDAO<T> genericDao;
	
    public genericProcessador(Class<T> typeParameterClass) {
        this.typeParameterClass = typeParameterClass;
    }
    
	
	
	
}
