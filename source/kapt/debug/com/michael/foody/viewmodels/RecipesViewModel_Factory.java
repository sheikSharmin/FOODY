package com.michael.foody.viewmodels;

import android.app.Application;
import com.michael.foody.data.DataStoreRepository;
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
public final class RecipesViewModel_Factory implements Factory<RecipesViewModel> {
  private final Provider<Application> applicationProvider;

  private final Provider<DataStoreRepository> dataStoreRepositoryProvider;

  public RecipesViewModel_Factory(Provider<Application> applicationProvider,
      Provider<DataStoreRepository> dataStoreRepositoryProvider) {
    this.applicationProvider = applicationProvider;
    this.dataStoreRepositoryProvider = dataStoreRepositoryProvider;
  }

  @Override
  public RecipesViewModel get() {
    return newInstance(applicationProvider.get(), dataStoreRepositoryProvider.get());
  }

  public static RecipesViewModel_Factory create(Provider<Application> applicationProvider,
      Provider<DataStoreRepository> dataStoreRepositoryProvider) {
    return new RecipesViewModel_Factory(applicationProvider, dataStoreRepositoryProvider);
  }

  public static RecipesViewModel newInstance(Application application,
      DataStoreRepository dataStoreRepository) {
    return new RecipesViewModel(application, dataStoreRepository);
  }
}
