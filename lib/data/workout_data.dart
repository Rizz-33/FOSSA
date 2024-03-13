import 'package:fossa/models/exercise.dart';
import 'package:fossa/models/workout.dart';

class WorkoutData {
  List<Workout> workoutList = [
    Workout(
      name: 'Upper Body',
      exercises: [
        Exercise(
          name: 'Bicep Curls',
          weight: '10',
          reps: '10',
          sets: '3',
        ),
      ],
    )
  ];

  List<Workout> getWorkoutList() {
    return workoutList;
  }
}