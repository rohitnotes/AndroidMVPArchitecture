package com.nawin.androidmvparchitecture.taggedquestion;

import com.nawin.androidmvparchitecture.BasePresenter;
import com.nawin.androidmvparchitecture.BaseView;
import com.nawin.androidmvparchitecture.data.model.viewmodel.TaggedQuestionViewModel;
import com.nawin.androidmvparchitecture.views.LoadMoreAdapter;

import java.util.List;

/**
 * Created by nawin on 6/14/17.
 */

public interface TaggedQuestionsContract {

    interface View extends BaseView<Presenter> {
        void showProgress();

        void showTagsLoadSuccess(List<TaggedQuestionViewModel> items, boolean hasMoreItems);

        void showTagsLoadError(String message);

        void showEmptyTags(String message);

        void showLoadMoreProgress();

        void showMoreTags(List<TaggedQuestionViewModel> items, boolean hasMoreItems);

        void showLoadMoreError();

        void onLoadComplete();

        void onLogoutSelection();

        void showNetworkNotAvailableError();

        void onRecyclerItemClicked(TaggedQuestionViewModel taggedQuestionViewModel, int position);
    }

    interface Presenter extends BasePresenter,
            LoadMoreAdapter.LoadMoreListener,
            TaggedQuestionsAdapter.RecyclerItemClickListener {
        void onLogout();
    }
}
