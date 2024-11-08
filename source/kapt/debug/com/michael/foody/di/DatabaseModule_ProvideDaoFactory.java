package com.michael.foody.di;

import com.michael.foody.data.database.RecipesDao;
import com.michael.foody.data.database.RecipesDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class DatabaseModule_ProvideDaoFactory implements Factory<RecipesDao> {
  private final Provider<RecipesDatabase> databaseProvider;

  public DatabaseModule_ProvideDaoFactory(Provider<RecipesDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public RecipesDao get() {
    return provideDao(databaseProvider.get());
  }

  public static DatabaseModule_ProvideDaoFactory create(
      Provider<RecipesDatabase> databaseProvider) {
    return new DatabaseModule_ProvideDaoFactory(databaseProvider);
  }

  public static RecipesDao provideDao(RecipesDatabase database) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideDao(database));
  }
}
