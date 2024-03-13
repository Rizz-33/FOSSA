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

  void addWorkout(String name) {
    workoutList.add(Workout(name: name, exercises: []));
  }

  void addExercise(String workoutName, String exerciseName, String weight, String reps, String sets) {
    Workout relevantWorkout = workoutList.firstWhere((workout) => workout.name == workoutName);

    relevantWorkout.exercises.add(
      Exercise(
        name: exerciseName,
        weight: weight,
        reps: reps,
        sets: sets
      ));
  }
}