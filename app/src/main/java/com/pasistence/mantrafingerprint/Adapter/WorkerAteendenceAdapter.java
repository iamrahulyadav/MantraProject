package com.pasistence.mantrafingerprint.Adapter;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.pasistence.mantrafingerprint.Common.Common;
import com.pasistence.mantrafingerprint.Models.WorkerModel;
import com.pasistence.mantrafingerprint.R;
import com.pasistence.mantrafingerprint.Remote.IMyAPI;
import com.pasistence.mantrafingerprint.ViewHolder.WorkerAttendenceHolder;
import com.pasistence.mantrafingerprint.ViewHolder.WorkerUploadHolder;

import java.util.List;

public class WorkerAteendenceAdapter extends RecyclerView.Adapter<WorkerAttendenceHolder>{

    Context mContext;
    Activity activity;
    List<WorkerModel> workerList ;
    public static String TAG = "adaper -->";
    String workerAttendenceid,attendenceperAddId,attendencecurAddId,attendencebankId;
    IMyAPI mService;


    public WorkerAteendenceAdapter(Activity activity, List<WorkerModel> workerList) {
        this.activity = activity;
        this.workerList = workerList;
    }

    @NonNull
    @Override
    public WorkerAttendenceHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.worker_upload_details_attendence,parent,false);
        mContext = activity;
        return new WorkerAttendenceHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull WorkerAttendenceHolder holder, final int position) {
        final WorkerModel workers = workerList.get(position);
        holder.attendenceWorkerName.setText("Name :- " + workers.getName().toString());
        holder.attendenceWorkerId.setText("Worker ID :- " + workers.getAdharcard_id().toString());
        holder.attendenceWorkerGender.setText("Gender :- " + workers.getGender().toString());
        holder.attendenceWorkerNumber.setText("Mobile No :- " + workers.getContact1().toString());
        holder.attendenceWorkerNumber2.setText("Alternate No :- " + workers.getContact2().toString());

        workerAttendenceid = workers.getWorkerId();
        attendenceperAddId = workers.getPermanentAddressId();
        attendencecurAddId = workers.getCurrentAddressId();
        attendencebankId = workers.getBankId();
        //init service
        mService = Common.getApi();

        workers.setId(workerList.get(position).getId());

        //   holder.circleImageViewPhoto.setImageURI(Uri.parse(workers.getImageUrl().toString()));

        Glide.with(mContext)
                .load(workers.getImageUrl().toString())
                .into(holder.attendencecircleImageViewPhoto);

        //  Picasso.get().load(workers.getImageUrl().toString()).into(holder.circleImageViewPhoto);



       /* holder.btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.e(TAG, workers.toString() );

                Intent UpdateWokerIntent = new Intent(mContext, WorkerUpdateActivity.class);
                UpdateWokerIntent.putExtra("type","edit");
                UpdateWokerIntent.putExtra("id",workers.getWorkerId());
                UpdateWokerIntent.putExtra("workers",workers);
                mContext.startActivity(UpdateWokerIntent);

                activity.finish();

                // Toast.makeText(mContext,workerList.get(position).getWorkerId().toString()+"EDIT", Toast.LENGTH_SHORT).show();

            }
        });*/
        /*holder.btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder alertDialog = new AlertDialog.Builder(activity);
                LayoutInflater layoutInflater = activity.getLayoutInflater();
                View changePwdLayout = layoutInflater.inflate(R.layout.transfer_dialog,null);
                alertDialog.setTitle("Delete Worker Details !");
                alertDialog.setMessage("Are you sure want to delete the Worker " + workers.getName());

                alertDialog.setView(changePwdLayout);

                //set Buttons
                alertDialog.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        mService.deleteWorkerDetails(
                                workeruploadid,
                                PreferenceUtils.getEmployee_id(mContext),
                                PreferenceUtils.getProject_id(mContext),
                                uploadbankId,
                                uploadperAddId,
                                uploadcurAddId
                        ).enqueue(new Callback<APIDeleteResponse>() {
                            @Override
                            public void onResponse(Call<APIDeleteResponse> call, Response<APIDeleteResponse> response) {
                                APIDeleteResponse result = response.body();
                                if (result.isError()) {
                                    Toast.makeText(mContext, result.getError_msg(), Toast.LENGTH_SHORT).show();
                                    Log.e("-->", result.getError_msg());
                                } else {
                                    Log.e("-->", result.toString());

                                }
                            }
                            @Override
                            public void onFailure(Call<APIDeleteResponse> call, Throwable t) {

                            }
                        });
                        new Database(mContext).deleteToWorkers(workers.getId());
                        Toast.makeText(mContext,workers.getId()+"Delete", Toast.LENGTH_SHORT).show();
                        activity.finish();
                        activity.startActivity(new Intent(mContext, WorkerDisplayList.class));

                        notifyDataSetChanged();
                        dialogInterface.dismiss();
                    }
                });

                alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        notifyDataSetChanged();
                    }
                });

                alertDialog.show();


            }
        });*/
       /* holder.btnDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Gettting Details Activity
                Intent workerDetails = new Intent(activity, ShowDetailsActivity.class);
                workerDetails.putExtra("id",workers.getId());
                workerDetails.putExtra("workers",workers);
                activity.startActivity(workerDetails);
            }
        });*/

    }

    @Override
    public int getItemCount() {
        return workerList.size();
    }

}
