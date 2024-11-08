package com.michael.foody.databinding;
import com.michael.foody.R;
import com.michael.foody.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRecipesBindingImpl extends FragmentRecipesBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.shimmerFrameLayout, 8);
        sViewsWithIds.put(R.id.recyclerview, 9);
        sViewsWithIds.put(R.id.recipes_fab, 10);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @Nullable
    private final com.michael.foody.databinding.PlaceholderRowLayoutBinding mboundView11;
    @Nullable
    private final com.michael.foody.databinding.PlaceholderRowLayoutBinding mboundView12;
    @Nullable
    private final com.michael.foody.databinding.PlaceholderRowLayoutBinding mboundView13;
    @Nullable
    private final com.michael.foody.databinding.PlaceholderRowLayoutBinding mboundView14;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentRecipesBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private FragmentRecipesBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[10]
            , (androidx.recyclerview.widget.RecyclerView) bindings[9]
            , (com.facebook.shimmer.ShimmerFrameLayout) bindings[8]
            );
        this.errorImageView.setTag(null);
        this.errorTextView.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView11 = (bindings[4] != null) ? com.michael.foody.databinding.PlaceholderRowLayoutBinding.bind((android.view.View) bindings[4]) : null;
        this.mboundView12 = (bindings[5] != null) ? com.michael.foody.databinding.PlaceholderRowLayoutBinding.bind((android.view.View) bindings[5]) : null;
        this.mboundView13 = (bindings[6] != null) ? com.michael.foody.databinding.PlaceholderRowLayoutBinding.bind((android.view.View) bindings[6]) : null;
        this.mboundView14 = (bindings[7] != null) ? com.michael.foody.databinding.PlaceholderRowLayoutBinding.bind((android.view.View) bindings[7]) : null;
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.mainViewModel == variableId) {
            setMainViewModel((com.michael.foody.viewmodels.MainViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMainViewModel(@Nullable com.michael.foody.viewmodels.MainViewModel MainViewModel) {
        this.mMainViewModel = MainViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.mainViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeMainViewModelRecipesResponse((androidx.lifecycle.MutableLiveData<com.michael.foody.util.NetworkResult<com.michael.foody.models.FoodRecipe>>) object, fieldId);
            case 1 :
                return onChangeMainViewModelReadRecipes((androidx.lifecycle.LiveData<java.util.List<com.michael.foody.data.database.entities.RecipesEntity>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMainViewModelRecipesResponse(androidx.lifecycle.MutableLiveData<com.michael.foody.util.NetworkResult<com.michael.foody.models.FoodRecipe>> MainViewModelRecipesResponse, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMainViewModelReadRecipes(androidx.lifecycle.LiveData<java.util.List<com.michael.foody.data.database.entities.RecipesEntity>> MainViewModelReadRecipes, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.michael.foody.viewmodels.MainViewModel mainViewModel = mMainViewModel;
        androidx.lifecycle.MutableLiveData<com.michael.foody.util.NetworkResult<com.michael.foody.models.FoodRecipe>> mainViewModelRecipesResponse = null;
        java.util.List<com.michael.foody.data.database.entities.RecipesEntity> mainViewModelReadRecipesGetValue = null;
        androidx.lifecycle.LiveData<java.util.List<com.michael.foody.data.database.entities.RecipesEntity>> mainViewModelReadRecipes = null;
        com.michael.foody.util.NetworkResult<com.michael.foody.models.FoodRecipe> mainViewModelRecipesResponseGetValue = null;

        if ((dirtyFlags & 0xfL) != 0) {



                if (mainViewModel != null) {
                    // read mainViewModel.recipesResponse
                    mainViewModelRecipesResponse = mainViewModel.getRecipesResponse();
                    // read mainViewModel.readRecipes
                    mainViewModelReadRecipes = mainViewModel.getReadRecipes();
                }
                updateLiveDataRegistration(0, mainViewModelRecipesResponse);
                updateLiveDataRegistration(1, mainViewModelReadRecipes);


                if (mainViewModelRecipesResponse != null) {
                    // read mainViewModel.recipesResponse.getValue()
                    mainViewModelRecipesResponseGetValue = mainViewModelRecipesResponse.getValue();
                }
                if (mainViewModelReadRecipes != null) {
                    // read mainViewModel.readRecipes.getValue()
                    mainViewModelReadRecipesGetValue = mainViewModelReadRecipes.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0xfL) != 0) {
            // api target 1

            com.michael.foody.bindingadapters.RecipesBinding.handleReadDataErrors(this.errorImageView, mainViewModelRecipesResponseGetValue, mainViewModelReadRecipesGetValue);
            com.michael.foody.bindingadapters.RecipesBinding.handleReadDataErrors(this.errorTextView, mainViewModelRecipesResponseGetValue, mainViewModelReadRecipesGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): mainViewModel.recipesResponse
        flag 1 (0x2L): mainViewModel.readRecipes
        flag 2 (0x3L): mainViewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}