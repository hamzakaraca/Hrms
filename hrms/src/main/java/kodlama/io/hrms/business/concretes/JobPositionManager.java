package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.JobPositionService;
import kodlama.io.hrms.dataAccess.abstracts.JobPositionDao;
import kodlama.io.hrms.entities.concretes.JobPosition;
@Service
public class JobPositionManager implements JobPositionService{
	
	private JobPositionDao jobPositiondao;

	public JobPositionManager(JobPositionDao jobPositiondao) {
		super();
		this.jobPositiondao = jobPositiondao;
	}

	@Override
	public List<JobPosition> getAll() {
		
		return this.jobPositiondao.findAll();
	}

}
