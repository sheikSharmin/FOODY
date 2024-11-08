package com.michael.foody.data;

import com.michael.foody.data.network.FoodRecipesApi;
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
public final class RemoteDataSource_Factory implements Factory<RemoteDataSource> {
  private final Provider<FoodRecipesApi> foodRecipesApiProvider;

  public RemoteDataSource_Factory(Provider<FoodRecipesApi> foodRecipesApiProvider) {
    this.foodRecipesApiProvider = foodRecipesApiProvider;
  }

  @Override
  public RemoteDataSource get() {
    return newInstance(foodRecipesApiProvider.get());
  }

  public static RemoteDataSource_Factory create(Provider<FoodRecipesApi> foodRecipesApiProvider) {
    return new RemoteDataSource_Factory(foodRecipesApiProvider);
  }

  public static RemoteDataSource newInstance(FoodRecipesApi foodRecipesApi) {
    return new RemoteDataSource(foodRecipesApi);
  }
}
