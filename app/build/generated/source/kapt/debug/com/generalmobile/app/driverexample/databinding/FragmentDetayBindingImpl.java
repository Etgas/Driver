package com.generalmobile.app.driverexample.databinding;
import com.generalmobile.app.driverexample.R;
import com.generalmobile.app.driverexample.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDetayBindingImpl extends FragmentDetayBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDetayBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentDetayBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.TextView) bindings[2]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.TextView) bindings[3]
            , (android.widget.ImageView) bindings[1]
            );
        this.detayAge.setTag(null);
        this.detayLayout.setTag(null);
        this.detayTeam.setTag(null);
        this.imgDetay.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.viewModel == variableId) {
            setViewModel((com.generalmobile.app.driverexample.ui.detay.DetayViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.generalmobile.app.driverexample.ui.detay.DetayViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelListe((androidx.databinding.ObservableField<com.generalmobile.app.driverexample.service.DriverDetay>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelListe(androidx.databinding.ObservableField<com.generalmobile.app.driverexample.service.DriverDetay> ViewModelListe, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        java.lang.String viewModelListeAgeToString = null;
        java.lang.String viewModelListeImage = null;
        com.generalmobile.app.driverexample.service.DriverDetay viewModelListeGet = null;
        androidx.databinding.ObservableField<com.generalmobile.app.driverexample.service.DriverDetay> viewModelListe = null;
        com.generalmobile.app.driverexample.ui.detay.DetayViewModel viewModel = mViewModel;
        java.lang.Integer viewModelListeAge = null;
        java.lang.String viewModelListeTeam = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.liste
                    viewModelListe = viewModel.getListe();
                }
                updateRegistration(0, viewModelListe);


                if (viewModelListe != null) {
                    // read viewModel.liste.get()
                    viewModelListeGet = viewModelListe.get();
                }


                if (viewModelListeGet != null) {
                    // read viewModel.liste.get().image
                    viewModelListeImage = viewModelListeGet.getImage();
                    // read viewModel.liste.get().age
                    viewModelListeAge = viewModelListeGet.getAge();
                    // read viewModel.liste.get().team
                    viewModelListeTeam = viewModelListeGet.getTeam();
                }


                if (viewModelListeAge != null) {
                    // read viewModel.liste.get().age.toString()
                    viewModelListeAgeToString = viewModelListeAge.toString();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.generalmobile.app.driverexample.core.Constants.loadAge(this.detayAge, viewModelListeAgeToString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.detayTeam, viewModelListeTeam);
            com.generalmobile.app.driverexample.core.Constants.loadImage(this.imgDetay, viewModelListeImage);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.liste
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}