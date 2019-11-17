package com.example.learningapplication;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.learningapplication.bean.CropRecord;

import java.util.List;

/**
 * @author: chips
 * @date: 2019/11/9
 * @description: 泛型
 **/
public class CropRvAdapter extends RecyclerView.Adapter<CropRvAdapter.CropViewHolder> {
    List<CropRecord> dataList;

    public CropRvAdapter(List<CropRecord> dataList) {
        this.dataList = dataList;
    }

    /**
     * 重点一
     * @param viewGroup
     * @param i
     * @return
     */
    @NonNull
    @Override
    public CropViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        // 创建布局
        // todo 2 注意要改xml文件来源
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_crop, viewGroup,
                false); // true
        return new CropViewHolder(itemView);
    }



    @Override
    public void onBindViewHolder(@NonNull CropViewHolder cropViewHolder, int i) {
        // 跟数据相关
        // xml 的数据注入
        // todo 3 注入数据
        CropRecord cropRecord = dataList.get(i);
        cropViewHolder.tvCreateTime.setText(cropRecord.getCreateTime());
        cropViewHolder.tvCrop.setText(cropRecord.getCropName());
        cropViewHolder.tvInput.setText(cropRecord.getInputRecord());
        cropViewHolder.tvLocation.setText(cropRecord.getLocation());
    }

    @Override
    public int getItemCount() {
        // 数据项长度
        return dataList.size();
    }

    /**
     * todo 1 对应item_crop，xml 数据项：一条数据
     */
    class CropViewHolder extends RecyclerView.ViewHolder {
        TextView tvCrop;
        TextView tvInput;
        TextView tvOp;
        TextView tvLocation;
        TextView tvCreateTime;

        public CropViewHolder(@NonNull View itemView) {
            super(itemView);
            tvCrop = itemView.findViewById(R.id.tv_field);
            tvInput = itemView.findViewById(R.id.tv_input);
            tvOp = itemView.findViewById(R.id.tv_op);
            tvLocation = itemView.findViewById(R.id.tv_location);
            tvCreateTime = itemView.findViewById(R.id.tv_time);
        }
    }
}
