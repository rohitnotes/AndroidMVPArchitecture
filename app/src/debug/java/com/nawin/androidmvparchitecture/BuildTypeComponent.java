package com.nawin.androidmvparchitecture;

import dagger.Subcomponent;

/**
 * Created by nawin on 7/20/17.
 */
@MvpScope
@Subcomponent
public interface BuildTypeComponent {

    BuildTypeConfig buildTypeConfig();
}
