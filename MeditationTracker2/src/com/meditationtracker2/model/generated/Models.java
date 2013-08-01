package com.meditationtracker2.model.generated;

import com.meditationtracker2.R;
import com.meditationtracker2.model.PracticeEditModel;

import doo.bandera.ModelBinder;

import android.app.Activity;
import android.view.View;

// this is also autogenerated class with 
public class Models {
	public static ModelBinder Bind(Activity where, PracticeEditModel model) {
		return new ModelBinder(new PracticeEditModelNormalizer(model),
				new View[] {
						where.findViewById(R.id.editPracticeCompletedCount),
						where.findViewById(R.id.editScheduledPerSession),
						where.findViewById(R.id.editPracticeTotal),
						where.findViewById(R.id.practice_image),
						where.findViewById(R.id.buttonPracticeImage),
						where.findViewById(R.id.datePickerScheduledEnd),
						where.findViewById(R.id.editPracticeName) });
	}

}
