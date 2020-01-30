// Generated by Dagger (https://google.github.io/dagger).
package com.generalmobile.app.driverexample.ui.detay;

import com.generalmobile.app.driverexample.service.driverApi;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class DetayViewModel_MembersInjector implements MembersInjector<DetayViewModel> {
  private final Provider<driverApi> baseApiProvider;

  public DetayViewModel_MembersInjector(Provider<driverApi> baseApiProvider) {
    this.baseApiProvider = baseApiProvider;
  }

  public static MembersInjector<DetayViewModel> create(Provider<driverApi> baseApiProvider) {
    return new DetayViewModel_MembersInjector(baseApiProvider);
  }

  @Override
  public void injectMembers(DetayViewModel instance) {
    injectBaseApi(instance, baseApiProvider.get());
  }

  public static void injectBaseApi(DetayViewModel instance, driverApi baseApi) {
    instance.baseApi = baseApi;
  }
}