package br.com.joaocalixto.augmentedreality;

import android.location.Location;

public interface OnLocationChangedListener {
    void onLocationChanged(Location currentLocation);
}