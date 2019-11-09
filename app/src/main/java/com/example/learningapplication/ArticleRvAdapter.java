package com.example.learningapplication;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.learningapplication.bean.Article;

import java.util.List;

/**
 * @author: chips
 * @date: 2019/11/9
 * @description:
 **/
public class ArticleRvAdapter extends RecyclerView.Adapter<ArticleRvAdapter.ArticleViewHolder> {
    List<Article> dataList;

    public ArticleRvAdapter(List<Article> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public ArticleViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        // 创建布局
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_article, viewGroup,
                false); // true
        return new ArticleViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ArticleViewHolder articleViewHolder, int i) {
        // 跟数据相关
        Article article = dataList.get(i);
        articleViewHolder.tvAuthor.setText(article.getShareUser());
        articleViewHolder.tvTitle.setText(article.getTitle());
        articleViewHolder.tvCate.setText(article.getSuperChapterName());
        articleViewHolder.tvTime.setText(article.getNiceDate());
    }

    @Override
    public int getItemCount() {
        // 数据项长度
        return dataList.size();
    }

    /**
     * item_article
     */
    class ArticleViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle;
        TextView tvAuthor;
        TextView tvTime;
        TextView tvCate;

        public ArticleViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tv_title);
            tvAuthor = itemView.findViewById(R.id.tv_author);
            tvCate = itemView.findViewById(R.id.tv_category);
            tvTime = itemView.findViewById(R.id.tv_time);
        }
    }
}
