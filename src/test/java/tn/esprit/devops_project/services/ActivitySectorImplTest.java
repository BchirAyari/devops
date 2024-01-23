//package tn.esprit.devopsproject.services;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import tn.esprit.devopsproject.entities.ActivitySector;
//import tn.esprit.devopsproject.repositories.ActivitySectorRepository;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.*;
//
//class ActivitySectorImplTest {
//
//    @Mock
//    private ActivitySectorRepository activitySectorRepository;
//
//    @InjectMocks
//    private ActivitySectorImpl activitySectorService;
//
//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.openMocks(this);
//    }
//
//    @Test
//    void retrieveAllActivitySectors() {
//        // Arrange
//        List<ActivitySector> expectedActivitySectors = Arrays.asList(
//                new ActivitySector(1L, "Code1", "Libelle1"),
//                new ActivitySector(2L, "Code2", "Libelle2")
//        );
//        when(activitySectorRepository.findAll()).thenReturn(expectedActivitySectors);
//
//        // Act
//        List<ActivitySector> actualActivitySectors = activitySectorService.retrieveAllActivitySectors();
//
//        // Assert
//        assertEquals(expectedActivitySectors, actualActivitySectors);
//    }
//
//    @Test
//    void addAndUpdateActivitySector() {
//        // Arrange
//        ActivitySector activitySectorToAdd = new ActivitySector(1L, "Code1", "Libelle1");
//        when(activitySectorRepository.save(activitySectorToAdd)).thenReturn(activitySectorToAdd);
//
//        // Act
//        ActivitySector addedActivitySector = activitySectorService.addActivitySector(activitySectorToAdd);
//
//        // Assert
//        assertEquals(activitySectorToAdd, addedActivitySector);
//
//        // Arrange
//        ActivitySector activitySectorToUpdate = new ActivitySector(1L, "UpdatedCode", "UpdatedLibelle");
//        when(activitySectorRepository.save(activitySectorToUpdate)).thenReturn(activitySectorToUpdate);
//
//        // Act
//        ActivitySector updatedActivitySector = activitySectorService.updateActivitySector(activitySectorToUpdate);
//
//        // Assert
//        assertEquals(activitySectorToUpdate, updatedActivitySector);
//    }
//
//    @Test
//    void deleteActivitySector() {
//        // Arrange
//        Long idToDelete = 1L;
//
//        // Act
//        activitySectorService.deleteActivitySector(idToDelete);
//
//        // Assert
//        verify(activitySectorRepository, times(1)).deleteById(idToDelete);
//    }
//
//    @Test
//    void retrieveActivitySector() {
//        // Arrange
//        Long idToRetrieve = 1L;
//        ActivitySector expectedActivitySector = new ActivitySector(idToRetrieve, "Code1", "Libelle1");
//        when(activitySectorRepository.findById(idToRetrieve)).thenReturn(Optional.of(expectedActivitySector));
//
//        // Act
//        ActivitySector actualActivitySector = activitySectorService.retrieveActivitySector(idToRetrieve);
//
//        // Assert
//        assertEquals(expectedActivitySector, actualActivitySector);
//    }
//
//    @Test
//    void retrieveActivitySector_InvalidId() {
//        // Arrange
//        Long invalidId = 999L;
//        when(activitySectorRepository.findById(invalidId)).thenReturn(Optional.empty());
//
//        // Act and Assert
//        assertThrows(IllegalArgumentException.class,
//                () -> activitySectorService.retrieveActivitySector(invalidId));
//    }
//
//    @Test
//    void retrieveActivitySector_NullId() {
//        // Act and Assert
//        assertThrows(IllegalArgumentException.class,
//                () -> activitySectorService.retrieveActivitySector(null));
//    }
//}
