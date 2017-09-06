/**
 * 
 */
package org.star.math.field;

/**
 * @author Andjuel
 *
 */
public interface Field {

	/**
	 * Returns a Field is (this + field) 
	 * 
	 * @param field
	 * @return
	 */
	public Field add(Field field);

	/**
	 * Returns a Field is (this - field) 
	 * 
	 * @param field
	 * @return
	 */
	public Field subtract(Field field);

	/**
	 * Returns a Field is (this * field) 
	 * 
	 * @param field
	 * @return
	 */
	public Field multiply(Field field);

	/**
	 * Returns a Field is (this / field) 
	 * 
	 * @param field
	 * @return
	 */
	public Field divide(Field field);

}
