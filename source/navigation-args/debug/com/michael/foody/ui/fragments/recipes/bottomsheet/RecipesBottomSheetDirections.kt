package com.michael.foody.ui.fragments.recipes.bottomsheet

import android.os.Bundle
import androidx.navigation.NavDirections
import com.michael.foody.R
import kotlin.Boolean
import kotlin.Int

public class RecipesBottomSheetDirections private constructor() {
  private data class ActionRecipesBottomSheetToRecipesFragment(
    public val backFromBottomSheet: Boolean = false,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_recipesBottomSheet_to_recipesFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putBoolean("backFromBottomSheet", this.backFromBottomSheet)
        return result
      }
  }

  public companion object {
    public fun actionRecipesBottomSheetToRecipesFragment(backFromBottomSheet: Boolean = false):
        NavDirections = ActionRecipesBottomSheetToRecipesFragment(backFromBottomSheet)
  }
}
