package com.michael.foody.viewmodels;

import android.app.Application;
import com.michael.foody.data.Repository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class MainViewModel_Factory implements Factory<MainViewModel> {
  private final Provider<Repository> repositoryProvider;

  private final Provider<Application> applicationProvider;

  public MainViewModel_Factory(Provider<Repository> repositoryProvider,
      Provider<Application> applicationProvider) {
    this.repositoryProvider = repositoryProvider;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public MainViewModel get() {
    return newInstance(repositoryProvider.get(), applicationProvider.get());
  }

  public static MainViewModel_Factory create(Provider<Repository> repositoryProvider,
      Provider<Application> applicationProvider) {
    return new MainViewModel_Factory(repositoryProvider, applicationProvider);
  }

  public static MainViewModel newInstance(Repository repository, Application application) {
    return new MainViewModel(repository, application);
  }
}
