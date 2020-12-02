package it.csi.stacore.staon.util.adapter;

import java.io.Serializable;
import java.util.List;

import it.csi.stacore.staon.etc.Constants;
import it.csi.stacore.staon.util.adapter.exception.DtoConversionException;



public interface DtoAdapterInterface <T,V> extends Serializable {


	public static final String LOGGER_PREFIX = Constants.APPLICATION_NAME + ".util.adapter";

	public V convertTo(T t) throws DtoConversionException;

	public T convertFrom(V v) throws DtoConversionException ;

	public List<V> convertTo(List<T> tList) throws DtoConversionException ;

	public List<T> convertFrom(List<V> vList) throws DtoConversionException ;

}
