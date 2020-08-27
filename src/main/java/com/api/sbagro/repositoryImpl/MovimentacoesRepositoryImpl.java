package com.api.sbagro.repositoryImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.api.sbagro.domain.model.Movimentacoes;
import com.api.sbagro.domain.repository.MovimentacoesRepository;

@Component
public class MovimentacoesRepositoryImpl implements MovimentacoesRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Movimentacoes> listar() {
        return manager.createQuery("from Movimentacoes where sr_deleted <> 'T'",
                Movimentacoes.class).getResultList();
    }

    @Transactional
    @Override
    public Movimentacoes save(Movimentacoes movimentacoes) {
		defaultItems(movimentacoes);
		return manager.merge(movimentacoes);
    }

	private void defaultItems(Movimentacoes movimentacoes) {
		int ultimoSequencial = Integer.parseInt(manager.createNativeQuery("SELECT m.sr_recno FROM trrhm04 m ORDER BY m.sr_recno DESC limit 1")
				.getResultList().get(0).toString());

		movimentacoes.setSr_recno(ultimoSequencial + 1);
		movimentacoes.setSr_deleted(movimentacoes.getSr_deleted() == null ? "" : movimentacoes.getSr_deleted());
	}

}
