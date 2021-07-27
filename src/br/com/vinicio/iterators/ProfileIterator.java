package br.com.vinicio.iterators;

import br.com.vinicio.profile.Profile;

public interface ProfileIterator {

    boolean hasNext();

    Profile getNext();

    void reset();
}
