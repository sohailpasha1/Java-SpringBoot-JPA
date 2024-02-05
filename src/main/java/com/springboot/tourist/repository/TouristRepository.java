
@Repository
public interface TouristRepository extends JpaRepository<Tourist, Long> {

  List<Tourist> findByName(String name);
  
  @Query(value = "select * from tourist where age= ?1",
                nativeQuery = true)
		List<Tourist> findByAgeNativeQuery(int age);
}
