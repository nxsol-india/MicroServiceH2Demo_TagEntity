package com.commons.MicroServiceH2Demo.interfaces;

import java.util.List;

public interface GenericOperations<E> {

    public E post(E entity);
    public List<E> get();
    public E put(E entity);
    public void delete(E entity);
}
