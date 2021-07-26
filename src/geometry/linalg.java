package geometry;
import java.util.Arrays;

public class linalg {
	
	public static double[] normalise (double[] vector) {
		double vec_norm = 0.0;
		double[] normalised_vector = new double[vector.length];
		for (int i = 0; i < vector.length; i++) {
			double curr_norm = Math.sqrt((Math.pow(vector[i], 2)));
			vec_norm += curr_norm;
		if (vec_norm == 0) {
			return vector;
		}
		}
		for (int j = 0; j < vector.length; j++) {
			normalised_vector[j] = vector[j] / vec_norm;
		}
		return normalised_vector;
	}
	
	public static double[] coordinates (float A, float B, float C) {
		double[] coords = {A, B, C};
		return coords;
	}
	
	public static double[] vec_addition (double[] coords_A, double[] coords_B ) {
		double[] add_AB = new double[coords_A.length];
		for (int i = 0; i < add_AB.length; i++) {
			add_AB[i] = coords_A[i] + coords_B[i];	
		}
		return add_AB;
		}
	
	public static double[] vec_AB (double[] coords_A, double[] coords_B ) {
		double[] AB = new double[coords_A.length];
		for (int i = 0; i < AB.length; i++) {
			AB[i] = coords_A[i] - coords_B[i];
			
		}
		return AB;
	}

	public static double dot_product (double[] coords_A, double[] coords_B) {
		double product = 0.0;
		for (int i = 0; i < coords_A.length; i++) {
			double multiply = coords_A[i] * coords_B[i];
			product += multiply;
		}
		return product;
		
	}
	public static double vector_distance (double[] coords_A, double[] coords_B) {
		double[] AB_vector = vec_AB(coords_A, coords_B);
		double length = Math.sqrt(dot_product(AB_vector, AB_vector));
		return length;
	}
	
	public static void main(String[] args) {
		// Example calculation
		double[] coordsA = coordinates(1, 1, 1);
		double[] coordsB = coordinates(2, 2, 2);
		double length = vector_distance(coordsA, coordsB);
		System.out.println(length);
		// returns sqrt 3
	}
	}
